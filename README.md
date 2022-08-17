# spring-localcache-demo 
* DB: H2 Database, 以ConcurrentMap、Redis、Ehcache 實作 localcache
* 結合 Observe pattern, 更新H2資料時同步更新所有 localcache

**A. Enviroment Setting**  
---
**1. Docker Redis**  
https://marcus116.blogspot.com/2019/02/how-to-run-redis-in-docker.html  
step 1 : pull docker image
```sql
> docker pull redis
```
step 2 : run redis container
```sql
> docker run --name redis-notification -p 6379:6379 -d redis
```

**B. UML & Config**  
---
1. 初始階段會將所有IOserveService, 透過ISubjectService中的register() 儲存至Array 
當使用者針對H2 DB做資料異動時, H2Service會呼叫updateAllCache()  
逐筆跑迴圈並呼叫IOserveService所有實作類的updateCache(), 同步更新所有localcache
![image](https://github.com/st801026bill/spring-localcache-demo/blob/master/image/uml.png)

2. 透過實作ApplicationRunner，再data.sql執行完之後，註冊所有observe並初始化cache 
```sql
@Component
public class ObserveInitialRunner implements ApplicationRunner {

    @Autowired
    private H2Service h2Service;
    @Autowired
    private ConcurrentMapService concurrentMapService;
    @Autowired
    private RedisService redisService;
    @Autowired
    private EhCacheService ehCacheService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        h2Service.register(concurrentMapService);
        h2Service.register(redisService);
        h2Service.register(ehCacheService);
        h2Service.updateAllCache();
    }
}
```

**C. Demo**  
---
**1. H2 Database:**  
```http://localhost:9000/h2-console/login.jsp```  
![image](https://github.com/st801026bill/spring-localcache-demo/blob/master/image/h2.png)

**2. Open Api:**  
```http://localhost:9000/spring-notification-producer/swagger-ui/index.html```  
![image](https://github.com/st801026bill/spring-localcache-demo/blob/master/image/openapi.png)

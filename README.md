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

**B. UML**  
---
![image](https://github.com/st801026bill/spring-localcache-demo/blob/master/image/uml.png)

**C. Demo**  
---
**1. H2 Database:**  
```http://localhost:9000/h2-console/login.jsp```  
![image](https://github.com/st801026bill/spring-localcache-demo/blob/master/image/h2.png)

**2. Open Api:**  
```http://localhost:9000/spring-notification-producer/swagger-ui/index.html```  
![image](https://github.com/st801026bill/spring-localcache-demo/blob/master/image/openapi.png)

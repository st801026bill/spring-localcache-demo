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


**C. Demo**  
---


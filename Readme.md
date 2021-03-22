# 개요
* 스프링부트 파라미터 수신 방법

# 상세내용
```java
@GetMapping("/")
public class demo_controller(@RequestParam(value = "name", required = false)String testparam){
    return "hello world";
}
```
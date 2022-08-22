@RestController
class app{
    @RequestMapping("/")
    String home() {
        "Hello World!"
    }
}


/*

spring run app.java -- --server.port=9000


*/
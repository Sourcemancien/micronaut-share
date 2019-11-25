@Value("${server.hostname:`http://localhost:9000`}")
String url;


@Controller("${api.controller.path:/api}")
class ApiController {

}


@Client("${client.hostname:`http://localhost:8080`}")
interface ApiClient {

}
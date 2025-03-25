package com.ids.backchargeous.cors;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


// 매우 중요한 내용은 next.config.ts 파일에서const nextConfig: NextConfig = {
//    async rewrites() {
//        return [
//            {
//                source: "/api/:path*",
//                destination: "http://localhost:8080/api/:path*",
//            },
//        ];
//    },
//}; 이거 추가해야함      그러면


//export default function Home() {
//    const [data, setData] = useState(null);
//
//    useEffect(() => {
//        fetch("http://localhost:8080/api/hello")
//            .then((res) => res.json())
//            .then((data) => setData(data));
//    }, []);
//
//    return (
//        <div>
//            <h1>Welcome to Next.js with Spring Boot!</h1>
//            {data ? (
//                <pre>{JSON.stringify(data, null, 2)}</pre>
//            ) : (
//                <p>Loading...</p>
//            )}
//        </div>
//    );
//} 이런식으로 타입스크립트 파일에서 주고받을 수 있음  >>즉 apicontroller 백단에 엔트포인트기반 메서드 설정 , 코스 설정 , 프론트에선 config파일에 추가

@Configuration
public class CorsConfig {
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins("http://localhost:3001")  //일단 3001로 해놨는데 next서버 포트번호 확인후 알아서 변경하셈
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                        .allowedHeaders("*")
                        .allowCredentials(true);
            }
        };
    }
}
package ra.thymeleaf.config;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    // DispatcherServlet : xử lý request gửi lên và chọn view để trả ve

    @Override
    protected Class<?>[] getRootConfigClasses() {
        // cấu hình các thành phần ko liên quan toi servlet
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        // web config
        return new Class[]{WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    @Override
    protected Filter[] getServletFilters() {
        CharacterEncodingFilter filter = new CharacterEncodingFilter("utf-8",true);
        return new Filter[]{filter};
    }
}

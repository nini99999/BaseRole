package com.poshist.baseRole.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;
import  org.apache.commons.lang3.ArrayUtils;
import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

public class ClassPathTldsLoader {
    private static final String SECURITY_TLD = "/META-INF/security.tld";

    final private List<String> classPathTlds;

    public ClassPathTldsLoader(String... classPathTlds) {
        super();
        if (ArrayUtils.isEmpty(classPathTlds)) {
            this.classPathTlds = Arrays.asList(SECURITY_TLD);
        } else {
            this.classPathTlds = Arrays.asList(classPathTlds);
        }
    }


}

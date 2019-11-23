package cn.alchemystudio.swagger.jaxrs;

import cn.alchemystudio.swagger.jaxrs.common.HttpWebResponse;
import cn.alchemystudio.swagger.jaxrs.rest.DummyService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class JaxrsSwaggerSampleApplicationTests {

    @Test
    void dummyTest() {
        DummyService dummyService = new DummyService();
        HttpWebResponse res = dummyService.get();
        assertTrue(res.isSuccess());
        assertEquals("dummy", res.getMessage());
        assertNull(res.getResult());
    }

}

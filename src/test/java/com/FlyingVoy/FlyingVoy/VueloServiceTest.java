package com.FlyingVoy.FlyingVoy;


import com.FlyingVoy.FlyingVoy.Servicios.VueloService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class VueloServiceTest {

    @Autowired
    private VueloService vueloService;




    @Test
    void testObtenerVuelosNuevo() {
        vueloService.sincronizarVuelosAPI()
                .doOnNext(vuelo -> System.out.println("Vuelo: " + vuelo))
                .blockLast();
    }
}

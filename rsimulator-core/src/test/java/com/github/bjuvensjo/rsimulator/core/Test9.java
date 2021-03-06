package com.github.bjuvensjo.rsimulator.core;

import com.github.bjuvensjo.rsimulator.core.config.CoreModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.net.URISyntaxException;
import java.nio.file.Paths;

import static org.junit.Assert.assertEquals;

/**
 * Test9.
 *
 * @author Magnus Bjuvensjö
 */
public class Test9 {
    private Simulator simulator;

    @Before
    public void init() {
        Injector injector = Guice.createInjector(new CoreModule());
        simulator = injector.getInstance(Simulator.class);
    }

    @Test
    public void test() throws URISyntaxException {
        String rootPath = Paths.get(getClass().getResource("/test9").toURI()).toString();
        String rootRelativePath = File.separator;
        String request = "";
        String contentType = "json";
        SimulatorResponse simulatorResponse = simulator.service(rootPath, rootRelativePath, request, contentType).get();
        assertEquals("{\"result\":\"ok\"}", simulatorResponse.getResponse());
    }
}

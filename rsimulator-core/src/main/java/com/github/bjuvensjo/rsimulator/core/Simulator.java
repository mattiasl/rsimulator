package com.github.bjuvensjo.rsimulator.core;

import com.google.inject.ImplementedBy;

import java.util.Optional;

/**
 * The Simulator encapsulates the simulation logic.
 *
 * @author Magnus Bjuvensjö
 */
@ImplementedBy(SimulatorImpl.class)
public interface Simulator {

    /**
     * Returns a SimulatorResponse that matches the specified request.
     *
     * @param rootPath         the root path on which to search recursively for matches to the specified request
     * @param rootRelativePath the path on which to search recursively for matches to the specified request
     * @param request          the request
     * @param contentType      the content type of the request, e.g. txt or xml
     * @return a SimulatorResponse that matches the specified request
     */
    Optional<SimulatorResponse> service(String rootPath, String rootRelativePath, String request, String contentType);
}
package com.mulesoft.training.soap;

import java.util.Collection;

import javax.jws.WebService;

@WebService
public interface AirportTerminalService {

	public abstract Terminal findTerminalStatus(String terminalNumber);

	public abstract Collection<Terminal> listAllTerminalStatuses();

}
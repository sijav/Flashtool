package org.plugins;

import java.util.Enumeration;

public interface  PluginInterface {

	public void setWorkdir(String workdir);
	public String getName();
	public void run() throws Exception;
	public Enumeration getCompatibleVersions();

}
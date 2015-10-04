package pt.devhub.plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;

/**
 * 
 * My first mojo.
 *
 */
@Mojo(name = "first")
public class FirstMojo extends AbstractMojo {

	public void execute() throws MojoExecutionException, MojoFailureException {

		getLog().info("First mojo correctly executed!");

	}

}

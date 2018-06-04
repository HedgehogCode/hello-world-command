/*
 * To the extent possible under law, the ImageJ developers have waived
 * all copyright and related or neighboring rights to this tutorial code.
 *
 * See the CC0 1.0 Universal license for details:
 *     http://creativecommons.org/publicdomain/zero/1.0/
 */

package de.csbd.learnathon.command;

import org.scijava.command.Command;
import org.scijava.plugin.Plugin;

import net.imagej.ImageJ;
import net.imglib2.type.numeric.RealType;

/**
 * This example illustrates how to create an ImageJ {@link Command} plugin.
 * <p>
 * The code here just outputs "Hello World".
 * </p>
 */
@Plugin(type = Command.class, menuPath = "Plugins>Hello World")
public class HelloWorldCommand<T extends RealType<T>> implements Command {

    @Override
    public void run() {
    	System.out.println("Hello World");
    }

    /**
     * This main function serves for development purposes.
     * It allows you to run the plugin immediately out of
     * your integrated development environment (IDE).
     *
     * @param args whatever, it's ignored
     * @throws Exception
     */
    public static void main(final String... args) throws Exception {
        // create the ImageJ application context with all available services
        final ImageJ ij = new ImageJ();
        ij.ui().showUI();
    }

}

package de.therazzerapp.coloredsigns;

import de.therazzerapp.coloredsigns.listener.SignListener;
import net.canarymod.Canary;
import net.canarymod.plugin.Plugin;

/**
 * Project: ColoredSigns
 * User: Pual
 * Date: 14/03/2015
 * Time: 00:19 PM
 * Package: com.therazzerapp.coloredsigns
 * E-Mail: rezzer101@googlemail.com
 */

public class ColoredSigns extends Plugin{
    @Override
    public boolean enable() {
        Canary.hooks().registerListener(new SignListener(),this);
        return true;
    }

    @Override
    public void disable() {
    }
}

package com.therazzerapp.coloredsigns.listener;

import net.canarymod.api.chat.ChatComponent;
import net.canarymod.api.entity.living.humanoid.Player;
import net.canarymod.api.world.blocks.Sign;
import net.canarymod.chat.ChatFormat;
import net.canarymod.hook.HookHandler;
import net.canarymod.hook.player.SignChangeHook;
import net.canarymod.plugin.PluginListener;

/**
 * Project: ColoredSigns
 * User: Pual
 * Date: 14/03/2015
 * Time: 00:22 PM
 * Package: com.therazzerapp.coloredsigns.listener
 * E-Mail: rezzer101@googlemail.com
 */

public class SignListener implements PluginListener {
    @HookHandler
    public void onSignCreate(SignChangeHook hook){

        Sign sign = hook.getSign();
        Player player = hook.getPlayer();

        if (player.hasPermission("coloredsign.create")){
            for(int x=0;x < sign.getLines().length;x++){
                if (sign.getComponentOnLine(x) != null){
                    sign.setComponentOnLine(getColoredLine(sign.getComponentOnLine(x)),x);
                }
            }
        }
    }

    private ChatComponent getColoredLine(ChatComponent chatComponent){
        return chatComponent.setText(ChatFormat.formatString(chatComponent.getText(), "&"));
    }
}

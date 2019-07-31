/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.com.thevoxelbox.voxelsniper.brush.perform;

import com.boydti.fawe.bukkit.wrapper.AsyncBlock;
import com.thevoxelbox.voxelsniper.Message;
import com.thevoxelbox.voxelsniper.SnipeData;


public class pNoUndo extends vPerformer {

    private int i;

    public pNoUndo() {
        name = "BOMB SQUAD";
    }

    @Override
    public void init(SnipeData v) {
        w = v.getWorld();
        i = v.getVoxelId();
    }

    @Override
    public void info(Message vm) {
        vm.performerName(name);
        vm.voxel();
    }

    @SuppressWarnings("deprecation")
    @Override
    public void perform(AsyncBlock b) {
        if (b.getTypeId() != i) {
            b.setTypeId(i);
        }
    }
}

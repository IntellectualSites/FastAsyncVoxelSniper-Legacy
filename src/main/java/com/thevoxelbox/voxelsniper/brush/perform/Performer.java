/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.com.thevoxelbox.voxelsniper.brush.perform;

import com.thevoxelbox.voxelsniper.Message;
import com.thevoxelbox.voxelsniper.SnipeData;


public interface Performer {

    void parse(String[] args, SnipeData v);

    void showInfo(Message vm);
}

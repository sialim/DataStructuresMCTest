package me.sialim.datastructuresmctest;

import org.bukkit.plugin.java.JavaPlugin;

public final class DataStructuresMCTest extends JavaPlugin {

    @Override
    public void onEnable()
    {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(new Node(5));
        tree.insert(new Node(3));
        tree.insert(new Node(4));
        tree.insert(new Node(2));
    }
}

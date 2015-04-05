package com.teambw.ne.api.block;

public class BlockVariant implements Comparable<BlockVariant>
{
    private int meta;

    private String name;

    public BlockVariant(int meta, String name)
    {
        this.meta = meta;
        this.name = name;
    }

    public int getMeta()
    {
        return this.meta;
    }

    public String getName()
    {
        return this.name;
    }

    @Override
    public int compareTo(BlockVariant o)
    {
        return this.meta;
    }
}
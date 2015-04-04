package com.teambw.ne.client.proxy;

import com.teambw.ne.client.renderer.ModelVariant;
import com.teambw.ne.common.proxy.CommonProxy;

public class ClientProxy extends CommonProxy
{
	private ModelVariant models = new ModelVariant();

	@Override
	public ModelVariant getModels()
	{
		return this.models;
	}
}

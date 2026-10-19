package net.warcentersaw.infinitygabling;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.warcentersaw.infinitygabling.datagen.ModModlelProvider;

public class InfinityGamblingDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
  var pack = fabricDataGenerator.createPack();
  pack.addProvider(ModModlelProvider::new);
	}
}

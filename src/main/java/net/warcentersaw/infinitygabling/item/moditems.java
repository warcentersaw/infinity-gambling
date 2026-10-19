package net.warcentersaw.infinitygabling.item;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTabs;
import net.warcentersaw.infinitygabling.InfinityGambling;
import net.minecraft.world.item.Item;

import java.util.function.Function;




public class moditems {
  public static final Item gambling = registeritem("gambling", Item::new);


  private static Item registeritem(String name, Function<Item.Properties, Item> Function) {
    return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(InfinityGambling.MOD_ID, name),
      Function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(InfinityGambling.MOD_ID, name)))));


  }


  public static void registermoditems() {
    InfinityGambling.LOGGER.info("Regestering mod items for" + InfinityGambling.MOD_ID);

    CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS).register(output -> {
      output.accept(gambling);
    });


  }
}

package com.rose.minestuckarsenal;

import com.mraof.minestuck.item.MSItemGroup;
import com.mraof.minestuck.item.MSItemTypes;
import com.mraof.minestuck.item.weapon.OnHitEffect;
import com.mraof.minestuck.item.weapon.WeaponItem;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.ObjectHolder;

import javax.annotation.Nonnull;

@ObjectHolder("minestuckarsenal")
@Mod.EventBusSubscriber(
        modid = "minestuckarsenal",
        bus = Mod.EventBusSubscriber.Bus.MOD
)
public class RegistryHandler {

    public static final Item HOUSE_KEY = (Item)getNull();
    public static final Item KEY_BLADE = (Item)getNull();
    public static final Item TRUE_BLUE = (Item)getNull();
    public static final Item KEY_AXE = (Item)getNull();
    public static final Item CHRONOLATCH = (Item)getNull();
    public static final Item CANDY_KEY = (Item)getNull();

    public static final Item BATON = (Item)getNull();
    public static final Item TWIRLING_BATON = (Item)getNull();
    public static final Item URANIUM_BATON = (Item)getNull();
    public static final Item CELESTIAL_FULCRUM = (Item)getNull();
    public static final Item WIND_WAKER = (Item)getNull();

    public static final Item YALDABAOTHS_KEYTON = (Item)getNull();
    public static final Item ALLWEDDOL = (Item)getNull();

    @Nonnull
    private static <T> T getNull() {
        return null;
    }

    @SubscribeEvent
    public static void init(final RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();

        registry.register(new WeaponItem(new WeaponItem.Builder(ItemTier.IRON, 2, -2.4F).efficiency(3.0F).set(MSItemTypes.SWORD_TOOL).add(OnHitEffect.SWEEP), new Item.Properties().group(MSItemGroup.WEAPONS)).setRegistryName("house_key"));
        registry.register(new WeaponItem(new WeaponItem.Builder(ItemTier.IRON, 3, -2.4F).efficiency(3.0F).set(MSItemTypes.SWORD_TOOL).add(OnHitEffect.SWEEP), new Item.Properties().group(MSItemGroup.WEAPONS)).setRegistryName("key_blade"));
        registry.register(new WeaponItem(new WeaponItem.Builder(ItemTier.DIAMOND, 4, -2.4F).efficiency(3.0F).set(MSItemTypes.SWORD_TOOL).add(OnHitEffect.SWEEP), new Item.Properties().group(MSItemGroup.WEAPONS)).setRegistryName("true_blue"));
        registry.register(new WeaponItem(new WeaponItem.Builder(ItemTier.DIAMOND, 5, -2.4F).efficiency(3.0F).set(MSItemTypes.SWORD_TOOL).add(OnHitEffect.SWEEP), new Item.Properties().group(MSItemGroup.WEAPONS)).setRegistryName("chronolatch"));
        registry.register(new WeaponItem(new WeaponItem.Builder(MSItemTypes.CANDY_TIER, 2, -2.4F).efficiency(3.0F).set(MSItemTypes.SWORD_TOOL).add(OnHitEffect.SWEEP), new Item.Properties().group(MSItemGroup.WEAPONS)).setRegistryName("candy_key"));

        registry.register(new WeaponItem(new WeaponItem.Builder(ItemTier.IRON, 3, -2.6F).efficiency(3.0F).set(MSItemTypes.AXE_TOOL), new Item.Properties().group(MSItemGroup.WEAPONS)).setRegistryName("key_axe"));

        registry.register(new WeaponItem(new WeaponItem.Builder(ItemTier.IRON, 2, -2.4F).efficiency(3.0F).set(MSItemTypes.SWORD_TOOL), new Item.Properties().group(MSItemGroup.WEAPONS)).setRegistryName("baton"));
        registry.register(new WeaponItem(new WeaponItem.Builder(ItemTier.IRON, 3, -2.4F).efficiency(3.0F).set(MSItemTypes.SWORD_TOOL), new Item.Properties().group(MSItemGroup.WEAPONS)).setRegistryName("twirling_baton"));
        registry.register(new WeaponItem(new WeaponItem.Builder(ItemTier.DIAMOND, 4, -2.4F).efficiency(3.0F).set(MSItemTypes.SWORD_TOOL), new Item.Properties().group(MSItemGroup.WEAPONS)).setRegistryName("uranium_baton"));
        registry.register(new WeaponItem(new WeaponItem.Builder(ItemTier.DIAMOND, 5, -2.4F).efficiency(3.0F).set(MSItemTypes.SWORD_TOOL), new Item.Properties().group(MSItemGroup.WEAPONS)).setRegistryName("celestial_fulcrum"));
        registry.register(new WeaponItem(new WeaponItem.Builder(ItemTier.DIAMOND, 6, -2.4F).efficiency(3.0F).set(MSItemTypes.SWORD_TOOL), new Item.Properties().group(MSItemGroup.WEAPONS)).setRegistryName("wind_waker"));

        registry.register(new WeaponItem(new WeaponItem.Builder(ItemTier.DIAMOND, 6, -2.4F).efficiency(3.0F).set(MSItemTypes.SWORD_TOOL).add(OnHitEffect.SWEEP), new Item.Properties().group(MSItemGroup.WEAPONS)).setRegistryName("yaldabaoths_keyton"));

    }
    //Items
    //public static final RegistryObject<Item> ROSE_QUARTZ = ITEMS.register("rose_quartz", ItemBase::new);
    //Blocks
    //public static final RegistryObject<Block> ROSE_QUARTZ_BLOCK = BLOCKS.register("rose_quartz_block", RoseQuartzBlock::new);

    //BlockItems
    //public static final RegistryObject<Item> ROSE_QUARTZ_BLOCK_ITEM = ITEMS.register("rose_quartz_block", () -> new BlockItemBase(ROSE_QUARTZ_BLOCK.get()));=
}

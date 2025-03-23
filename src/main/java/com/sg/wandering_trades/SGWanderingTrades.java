package com.sg.wandering_trades;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.component.type.PotionContentsComponent;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.Potions;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradedItem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SGWanderingTrades implements ModInitializer {
	public static final String MOD_ID = "sg-wandering-trades";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		TradeOfferHelper.registerWanderingTraderOffers(1, f -> {
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 1), new ItemStack(Items.ANGLER_POTTERY_SHERD), 8, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 1), new ItemStack(Items.ARCHER_POTTERY_SHERD), 8, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 1), new ItemStack(Items.ARMS_UP_POTTERY_SHERD), 8, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 1), new ItemStack(Items.BLADE_POTTERY_SHERD), 8, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 1), new ItemStack(Items.BREWER_POTTERY_SHERD), 8, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 1), new ItemStack(Items.BURN_POTTERY_SHERD), 8, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 1), new ItemStack(Items.DANGER_POTTERY_SHERD), 8, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 1), new ItemStack(Items.FLOW_POTTERY_SHERD), 8, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 1), new ItemStack(Items.EXPLORER_POTTERY_SHERD), 8, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 1), new ItemStack(Items.FRIEND_POTTERY_SHERD), 8, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 1), new ItemStack(Items.GUSTER_POTTERY_SHERD), 8, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 1), new ItemStack(Items.HEART_POTTERY_SHERD), 8, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 1), new ItemStack(Items.HEARTBREAK_POTTERY_SHERD), 8, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 1), new ItemStack(Items.HOWL_POTTERY_SHERD), 8, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 1), new ItemStack(Items.MINER_POTTERY_SHERD), 8, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 1), new ItemStack(Items.MOURNER_POTTERY_SHERD), 8, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 1), new ItemStack(Items.PLENTY_POTTERY_SHERD), 8, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 1), new ItemStack(Items.PRIZE_POTTERY_SHERD), 8, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 1), new ItemStack(Items.SCRAPE_POTTERY_SHERD), 8, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 1), new ItemStack(Items.SHEAF_POTTERY_SHERD), 8, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 1), new ItemStack(Items.SHELTER_POTTERY_SHERD), 8, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 1), new ItemStack(Items.SKULL_POTTERY_SHERD), 8, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 1), new ItemStack(Items.SNORT_POTTERY_SHERD), 8, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 1), new ItemStack(Items.FIELD_MASONED_BANNER_PATTERN), 8, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 1), new ItemStack(Items.BORDURE_INDENTED_BANNER_PATTERN), 8, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 1), new ItemStack(Items.FLOWER_BANNER_PATTERN), 8, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 1), new ItemStack(Items.CREEPER_BANNER_PATTERN), 8, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 1), new ItemStack(Items.SKULL_BANNER_PATTERN), 8, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 1), new ItemStack(Items.MOJANG_BANNER_PATTERN), 8, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 1), new ItemStack(Items.GLOBE_BANNER_PATTERN), 8, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 1), new ItemStack(Items.PIGLIN_BANNER_PATTERN), 8, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 1), new ItemStack(Items.FLOW_BANNER_PATTERN), 8, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 1), new ItemStack(Items.GUSTER_BANNER_PATTERN), 8, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 1), new ItemStack(Items.OAK_LOG, 16), 4, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 1), new ItemStack(Items.SPRUCE_LOG, 16), 4, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 1), new ItemStack(Items.BIRCH_LOG, 16), 4, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 1), new ItemStack(Items.JUNGLE_LOG, 16), 4, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 1), new ItemStack(Items.ACACIA_LOG, 16), 4, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 1), new ItemStack(Items.DARK_OAK_LOG, 16), 4, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 1), new ItemStack(Items.MANGROVE_LOG, 16), 4, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 1), new ItemStack(Items.CHERRY_LOG, 16), 4, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 1), new ItemStack(Items.PALE_OAK_LOG, 16), 4, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 1), new ItemStack(Items.BAMBOO_BLOCK, 16), 4, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 1), new ItemStack(Items.CRIMSON_STEM, 16), 4, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 1), new ItemStack(Items.WARPED_STEM, 16), 4, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 16), new ItemStack(Items.HEART_OF_THE_SEA, 1), 1, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 32), new ItemStack(Items.SHULKER_SHELL, 1), 2, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 32), new ItemStack(Items.OMINOUS_TRIAL_KEY, 1), 2, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 8), new ItemStack(Items.TRIAL_KEY, 1), 4, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 1), new ItemStack(Items.ECHO_SHARD, 1), 4, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 64), new ItemStack(Items.HEAVY_CORE, 1), 1, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 64), new ItemStack(Items.WITHER_SKELETON_SKULL, 1), 3, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 2), new ItemStack(Items.WITHER_ROSE, 1), 16, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 4), new ItemStack(Items.DRAGON_BREATH, 1), 4, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 64), new ItemStack(Items.ENCHANTED_GOLDEN_APPLE, 1), 1, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 8), new ItemStack(Items.SNIFFER_EGG, 1), 2, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 32), new ItemStack(Items.BREEZE_ROD, 32), 4, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 16), new ItemStack(Items.NETHERITE_SCRAP, 1), 4, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 8), new ItemStack(Items.TNT, 16), 4, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 8), new ItemStack(Items.END_CRYSTAL, 1), 4, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 16), new ItemStack(Items.SPONGE, 16), 4, 2, 1);
			});
			f.add((entity, random) -> {
				ItemStack is = new ItemStack(Items.ENCHANTED_BOOK, 1);
				is.addEnchantment(entity.getWorld().getRegistryManager().getOrThrow(RegistryKeys.ENCHANTMENT).getOrThrow(net.minecraft.enchantment.Enchantments.WIND_BURST), 3);
				return new TradeOffer(new TradedItem(Items.EMERALD, 8), is, 4, 2, 1);
			});
			f.add((entity, random) -> {
				ItemStack is = new ItemStack(Items.ENCHANTED_BOOK, 1);
				is.addEnchantment(entity.getWorld().getRegistryManager().getOrThrow(RegistryKeys.ENCHANTMENT).getOrThrow(net.minecraft.enchantment.Enchantments.SOUL_SPEED), 3);
				return new TradeOffer(new TradedItem(Items.EMERALD, 8), is, 4, 2, 1);
			});
			f.add((entity, random) -> {
				ItemStack is = new ItemStack(Items.ENCHANTED_BOOK, 1);
				is.addEnchantment(entity.getWorld().getRegistryManager().getOrThrow(RegistryKeys.ENCHANTMENT).getOrThrow(net.minecraft.enchantment.Enchantments.SWIFT_SNEAK), 3);
				return new TradeOffer(new TradedItem(Items.EMERALD, 8), is, 4, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 8), PotionContentsComponent.createStack(Items.POTION, Potions.LUCK), 4, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 16), new ItemStack(Items.SENTRY_ARMOR_TRIM_SMITHING_TEMPLATE, 1), 4, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 16), new ItemStack(Items.VEX_ARMOR_TRIM_SMITHING_TEMPLATE, 1), 4, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 16), new ItemStack(Items.WILD_ARMOR_TRIM_SMITHING_TEMPLATE, 1), 4, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 16), new ItemStack(Items.COAST_ARMOR_TRIM_SMITHING_TEMPLATE, 1), 4, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 16), new ItemStack(Items.DUNE_ARMOR_TRIM_SMITHING_TEMPLATE, 1), 4, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 16), new ItemStack(Items.WAYFINDER_ARMOR_TRIM_SMITHING_TEMPLATE, 1), 4, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 16), new ItemStack(Items.RAISER_ARMOR_TRIM_SMITHING_TEMPLATE, 1), 4, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 16), new ItemStack(Items.SHAPER_ARMOR_TRIM_SMITHING_TEMPLATE, 1), 4, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 16), new ItemStack(Items.HOST_ARMOR_TRIM_SMITHING_TEMPLATE, 1), 4, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 16), new ItemStack(Items.WARD_ARMOR_TRIM_SMITHING_TEMPLATE, 1), 4, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 16), new ItemStack(Items.SILENCE_ARMOR_TRIM_SMITHING_TEMPLATE, 1), 4, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 16), new ItemStack(Items.TIDE_ARMOR_TRIM_SMITHING_TEMPLATE, 1), 4, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 16), new ItemStack(Items.SNOUT_ARMOR_TRIM_SMITHING_TEMPLATE, 1), 4, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 16), new ItemStack(Items.RIB_ARMOR_TRIM_SMITHING_TEMPLATE, 1), 4, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 16), new ItemStack(Items.EYE_ARMOR_TRIM_SMITHING_TEMPLATE, 1), 4, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 16), new ItemStack(Items.SPIRE_ARMOR_TRIM_SMITHING_TEMPLATE, 1), 4, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 16), new ItemStack(Items.FLOW_ARMOR_TRIM_SMITHING_TEMPLATE, 1), 4, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 16), new ItemStack(Items.BOLT_ARMOR_TRIM_SMITHING_TEMPLATE, 1), 4, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 16), new ItemStack(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, 1), 4, 2, 1);
			});
			f.add((entity, random) -> {
				return new TradeOffer(new TradedItem(Items.EMERALD, 4), new ItemStack(Items.HONEY_BLOCK, 16), 4, 2, 1);
			});
		});
	}
}
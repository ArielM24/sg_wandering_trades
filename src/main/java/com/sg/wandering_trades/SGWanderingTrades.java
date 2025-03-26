package com.sg.wandering_trades;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.component.type.PotionContentsComponent;
import net.minecraft.item.Items;
import net.minecraft.potion.Potions;
import net.minecraft.util.Identifier;
import net.minecraft.village.TradeOffers.Factory;
import net.minecraft.village.TradeOffers.SellItemFactory;
import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class SGWanderingTrades implements ModInitializer {
	public static final String MOD_ID = "sg-wandering-trades";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		
		TradeOfferHelper.registerWanderingTraderOffers((consumer)-> {
			ArrayList<Factory> trades = new ArrayList<>();
			// pottery sherds
			trades.add(new SellItemFactory(Items.ANGLER_POTTERY_SHERD, 2, 16, 4, 1));
			trades.add(new SellItemFactory(Items.ARCHER_POTTERY_SHERD, 2, 16, 4, 1));
			trades.add(new SellItemFactory(Items.ARMS_UP_POTTERY_SHERD, 2, 16, 4, 1));
			trades.add(new SellItemFactory(Items.BLADE_POTTERY_SHERD, 2, 16, 4, 1));
			trades.add(new SellItemFactory(Items.BREWER_POTTERY_SHERD, 2, 16, 4, 1));
			trades.add(new SellItemFactory(Items.BURN_POTTERY_SHERD, 2, 16, 4, 1));
			trades.add(new SellItemFactory(Items.DANGER_POTTERY_SHERD, 2, 16, 4, 1));
			trades.add(new SellItemFactory(Items.FLOW_POTTERY_SHERD, 2, 16, 4, 1));
			trades.add(new SellItemFactory(Items.EXPLORER_POTTERY_SHERD, 2, 16, 4, 1));
			trades.add(new SellItemFactory(Items.FRIEND_POTTERY_SHERD, 2, 16, 4, 1));
			trades.add(new SellItemFactory(Items.GUSTER_POTTERY_SHERD, 2, 16, 4, 1));
			trades.add(new SellItemFactory(Items.HEART_POTTERY_SHERD, 2, 16, 4, 1));
			trades.add(new SellItemFactory(Items.HEARTBREAK_POTTERY_SHERD, 2, 16, 4, 1));
			trades.add(new SellItemFactory(Items.HOWL_POTTERY_SHERD, 2, 16, 4, 1));
			trades.add(new SellItemFactory(Items.MINER_POTTERY_SHERD, 2, 16, 4, 1));
			trades.add(new SellItemFactory(Items.MOURNER_POTTERY_SHERD, 2, 16, 4, 1));
			trades.add(new SellItemFactory(Items.PLENTY_POTTERY_SHERD, 2, 16, 4, 1));
			trades.add(new SellItemFactory(Items.PRIZE_POTTERY_SHERD, 2, 16, 4, 1));
			trades.add(new SellItemFactory(Items.SCRAPE_POTTERY_SHERD, 2, 16, 4, 1));
			trades.add(new SellItemFactory(Items.SHEAF_POTTERY_SHERD, 2, 16, 4, 1));
			trades.add(new SellItemFactory(Items.SHELTER_POTTERY_SHERD, 2, 16, 4, 1));
			trades.add(new SellItemFactory(Items.SKULL_POTTERY_SHERD, 2, 16, 4, 1));
			trades.add(new SellItemFactory(Items.SNORT_POTTERY_SHERD, 2, 16, 4, 1));
			// banner patterns
			trades.add(new SellItemFactory(Items.FIELD_MASONED_BANNER_PATTERN, 1, 1, 1, 1));
			trades.add(new SellItemFactory(Items.BORDURE_INDENTED_BANNER_PATTERN, 1, 1, 1, 1));
			trades.add(new SellItemFactory(Items.FLOWER_BANNER_PATTERN, 1, 1, 1, 1));
			trades.add(new SellItemFactory(Items.CREEPER_BANNER_PATTERN, 1, 1, 1, 1));
			trades.add(new SellItemFactory(Items.SKULL_BANNER_PATTERN, 1, 1, 1, 1));
			trades.add(new SellItemFactory(Items.MOJANG_BANNER_PATTERN, 1, 1, 1, 1));
			trades.add(new SellItemFactory(Items.GLOBE_BANNER_PATTERN, 1, 1, 1, 1));
			trades.add(new SellItemFactory(Items.PIGLIN_BANNER_PATTERN, 1, 1, 1, 1));
			trades.add(new SellItemFactory(Items.FLOW_BANNER_PATTERN, 1, 1, 1, 1));
			trades.add(new SellItemFactory(Items.GUSTER_BANNER_PATTERN, 1, 1, 1, 1));
			// logs
			trades.add(new SellItemFactory(Items.BAMBOO_BLOCK, 1, 8, 8, 1));
			trades.add(new SellItemFactory(Items.CRIMSON_STEM, 1, 8, 8, 1));
			trades.add(new SellItemFactory(Items.WARPED_STEM, 1, 8, 8, 1));
			// special
			trades.add(new SellItemFactory(Items.HEART_OF_THE_SEA, 32, 1, 2, 1));
			trades.add(new SellItemFactory(Items.SHULKER_SHELL, 32, 1, 2, 1));
			trades.add(new SellItemFactory(Items.OMINOUS_TRIAL_KEY, 32, 1, 2, 1));
			trades.add(new SellItemFactory(Items.TRIAL_KEY, 8, 1, 4, 1));
			trades.add(new SellItemFactory(Items.ECHO_SHARD, 1, 1, 8, 1));
			trades.add(new SellItemFactory(Items.HEAVY_CORE, 64, 1, 1, 1));
			trades.add(new SellItemFactory(Items.WITHER_SKELETON_SKULL, 64, 1, 1, 1));
			trades.add(new SellItemFactory(Items.WITHER_ROSE, 2, 1, 16, 1));
			trades.add(new SellItemFactory(Items.DRAGON_BREATH, 4, 1, 4, 1));
			trades.add(new SellItemFactory(Items.ENCHANTED_GOLDEN_APPLE, 64, 1, 1, 1));
			trades.add(new SellItemFactory(Items.SNIFFER_EGG, 8, 1, 2, 1));
			trades.add(new SellItemFactory(Items.BREEZE_ROD, 16, 4, 4, 1));
			trades.add(new SellItemFactory(Items.NETHERITE_SCRAP, 16, 4, 4, 1));
			trades.add(new SellItemFactory(Items.TNT, 16, 4, 4, 1));
			trades.add(new SellItemFactory(Items.END_CRYSTAL, 16, 4, 4, 1));
			trades.add(new SellItemFactory(Items.SPONGE, 16, 4, 4, 1));
			trades.add(new SellItemFactory(Items.HONEY_BLOCK, 16, 16, 4, 1));
			
			// potions
			trades.add(new SellItemFactory(PotionContentsComponent.createStack(Items.POTION, Potions.LUCK), 8, 1, 4, 1));
			// trim templates
			trades.add(new SellItemFactory(Items.SENTRY_ARMOR_TRIM_SMITHING_TEMPLATE, 32, 1, 4, 1));
			trades.add(new SellItemFactory(Items.VEX_ARMOR_TRIM_SMITHING_TEMPLATE, 32, 1, 4, 1));
			trades.add(new SellItemFactory(Items.WILD_ARMOR_TRIM_SMITHING_TEMPLATE, 32, 1, 4, 1));
			trades.add(new SellItemFactory(Items.COAST_ARMOR_TRIM_SMITHING_TEMPLATE, 32, 1, 4, 1));
			trades.add(new SellItemFactory(Items.DUNE_ARMOR_TRIM_SMITHING_TEMPLATE, 32, 1, 4, 1));
			trades.add(new SellItemFactory(Items.WAYFINDER_ARMOR_TRIM_SMITHING_TEMPLATE, 32, 1, 4, 1));
			trades.add(new SellItemFactory(Items.RAISER_ARMOR_TRIM_SMITHING_TEMPLATE, 32, 1, 4, 1));
			trades.add(new SellItemFactory(Items.SHAPER_ARMOR_TRIM_SMITHING_TEMPLATE, 32, 1, 4, 1));
			trades.add(new SellItemFactory(Items.HOST_ARMOR_TRIM_SMITHING_TEMPLATE, 32, 1, 4, 1));
			trades.add(new SellItemFactory(Items.WARD_ARMOR_TRIM_SMITHING_TEMPLATE, 32, 1, 4, 1));
			trades.add(new SellItemFactory(Items.SILENCE_ARMOR_TRIM_SMITHING_TEMPLATE, 64, 1, 4, 1));
			trades.add(new SellItemFactory(Items.TIDE_ARMOR_TRIM_SMITHING_TEMPLATE, 32, 1, 4, 1));
			trades.add(new SellItemFactory(Items.SNOUT_ARMOR_TRIM_SMITHING_TEMPLATE, 32, 1, 4, 1));
			trades.add(new SellItemFactory(Items.RIB_ARMOR_TRIM_SMITHING_TEMPLATE, 32, 1, 4, 1));
			trades.add(new SellItemFactory(Items.EYE_ARMOR_TRIM_SMITHING_TEMPLATE, 32, 1, 4, 1));
			trades.add(new SellItemFactory(Items.SPIRE_ARMOR_TRIM_SMITHING_TEMPLATE, 32, 1, 4, 1));
			trades.add(new SellItemFactory(Items.FLOW_ARMOR_TRIM_SMITHING_TEMPLATE, 32, 1, 4, 1));
			trades.add(new SellItemFactory(Items.BOLT_ARMOR_TRIM_SMITHING_TEMPLATE, 32, 1, 4, 1));
			trades.add(new SellItemFactory(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, 64, 1, 4, 1));
			consumer.pool(Identifier.of(MOD_ID), 1, trades);
		});
	}
}
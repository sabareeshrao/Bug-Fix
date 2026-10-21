package com.salesmanager.test.shoppingcart;

import com.salesmanager.core.business.services.shoppingcart.CartCollectionChallenges;
import com.salesmanager.core.model.shoppingcart.ShoppingCartItem;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import static org.junit.Assert.*;

/**
 * Acceptance tests intentionally fail before the interview challenges are fixed.
 * Do not edit these tests to get a green result.
 */
public class CartCollectionChallengesTest {
    private static ShoppingCartItem item(String sku, long variant, int quantity) {
        ShoppingCartItem item = new ShoppingCartItem();
        item.setSku(sku);
        item.setVariant(variant);
        item.setQuantity(quantity);
        return item;
    }

    private static List<String> skus(List<ShoppingCartItem> items) {
        return items.stream().map(ShoppingCartItem::getSku).collect(Collectors.toList());
    }

    @Test public void q1_quantitiesAreAdded() {
        assertEquals(5, CartCollectionChallenges.mergeQuantities(2, 3));
    }

    @Test public void q2_distinctLinesKeepOriginalOrderAndNormalizeSku() {
        List<ShoppingCartItem> input = Arrays.asList(item("table", 1, 1), item("chair", 1, 1), item(" CHAIR ", 1, 1));
        assertEquals(Arrays.asList("table", "chair"), skus(CartCollectionChallenges.distinctCartLines(input)));
    }

    @Test public void q3_countDistinctCanonicalSkusNotRowsOrVariants() {
        List<ShoppingCartItem> input = Arrays.asList(item("chair", 1, 1), item(" CHAIR ", 2, 1), item("chair", 3, 1));
        assertEquals(1, CartCollectionChallenges.distinctSkuCount(input));
    }

    @Test public void q4_removeEveryRetiredItemWithoutMutatingInput() {
        List<ShoppingCartItem> input = new ArrayList<>(Arrays.asList(
                item("retired-a", 1, 1), item("retired-b", 1, 1), item("available", 1, 1)));
        Set<String> retired = new HashSet<>(Arrays.asList("retired-a", "retired-b"));
        List<ShoppingCartItem> output = CartCollectionChallenges.withoutRetired(input, retired);
        assertEquals(Arrays.asList("available"), skus(output));
        assertEquals("Caller-owned cart must not be mutated", 3, input.size());
    }

    @Test public void q5_equalSkuVariantKeysDeduplicate() {
        List<ShoppingCartItem> input = Arrays.asList(item("chair", 4, 1), item("CHAIR", 4, 2));
        assertEquals(1, CartCollectionChallenges.uniqueProductVariants(input).size());
    }

    @Test public void q6_correctedSkuStillFindsQuantity() {
        assertEquals(7, CartCollectionChallenges.correctedSkuQuantity("old", " NEW ", 7));
    }

    @Test public void q7_existingQuantityIsIncremented() {
        Map<String, Integer> quantities = new HashMap<>();
        quantities.put("chair", 2);
        assertEquals(5, CartCollectionChallenges.addQuantity(quantities, "chair", 3));
        assertEquals(Integer.valueOf(5), quantities.get("chair"));
    }

    @Test public void q8_summaryAddsQuantitiesByCanonicalSku() {
        List<ShoppingCartItem> input = Arrays.asList(item("chair", 1, 2), item(" CHAIR ", 1, 3));
        Map<String, Integer> result = CartCollectionChallenges.quantityTotals(input);
        assertEquals(1, result.size());
        assertEquals(Integer.valueOf(5), result.get("chair"));
    }

    @Test public void q9_firstVisitOrderAndDisplaySpellingSurvive() {
        assertEquals(Arrays.asList("table", "chair"),
                CartCollectionChallenges.firstViewedSkus(Arrays.asList("table", "chair", "TABLE")));
    }

    @Test public void q10_priorityPreservesEveryEntryAndRelativeOrder() {
        assertEquals(Arrays.asList("chair", "chair", "lamp", "table", "book"),
                CartCollectionChallenges.priorityProcessingOrder(
                        Arrays.asList("lamp", "chair", "table", "chair", "book"), "chair"));
    }
}

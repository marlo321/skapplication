package com.holyak.skhidnytsa.dummy;

import android.util.Log;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static android.content.ContentValues.TAG;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    public static List<String> diseaseNames = new ArrayList<>();


    static {
        // Add some sample items.
        List<SkhidnytsaItem> list = SkhidnytsaImporter.list;

        for ( String str:
                diseaseNames) {
            Log.d(TAG, "" + str);
        }
//        List<SkhidnytsaItem> filtedList = filterItem(list, diseaseNames);
        for (int i = 1; i <= list.size(); i++) {
            addItem(createDummyItem(i, list.get(i - 1)));
        }
    }

    private static List<SkhidnytsaItem> filterItem(List<SkhidnytsaItem> list, List<String> diseaseNames){
        List<SkhidnytsaItem> filteredList = new ArrayList<>();
        for (SkhidnytsaItem item : list) {
           if (item.getDiseases().containsAll(diseaseNames)){
               filteredList.add(item);
           }
        }
        return filteredList;
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static DummyItem createDummyItem(int position, SkhidnytsaItem currentItem) {
        return new DummyItem(String.valueOf(position), "Джерело " + currentItem.getContent(), currentItem.getDetails(), currentItem.getDiseases());
    }

//    private static String makeDetails(int position) {
//        StringBuilder builder = new StringBuilder();
//        builder.append("Details about Item: ").append(position);
//        for (int i = 0; i < position; i++) {
//            builder.append("\nMore details information here.");
//        }
//        return builder.toString();
//    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String content;
        public final String details;
        public final List<String> diseases;

        public DummyItem(String id, String content, String details, List<String> diseases) {
            this.id = id;
            this.content = content;
            this.details = details;
            this.diseases = diseases;
        }

        public List<String> getDiseases() {
            return diseases;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
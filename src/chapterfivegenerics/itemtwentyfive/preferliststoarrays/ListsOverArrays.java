package chapterfivegenerics.itemtwentyfive.preferliststoarrays;

import java.util.ArrayList;
import java.util.List;

public class ListsOverArrays
{
        public static void main(String[] args)
        {
                final Object[] objectArray = new Long[1];
                objectArray[0] = "I don't fit in";

                List<Object> ol = new ArrayList<Long>();
                ol.add("I don't fit in!");
        }
}

package indi.yume.tools.sample

import java.util.ArrayList

/**
 * Created by yume on 17-4-20.
 */
data class ItemModel(
    val id: Long = 0,
    val title: String? = null,
    val content: String? = null)

internal fun generaModel(index: Int): ItemModel {
    return ItemModel(
            index.toLong(),
            "Title $index",
            "This is Content $index"
    )
}

internal fun genList(startIndex: Int, count: Int): List<ItemModel> {
    val list = ArrayList<ItemModel>()
    for (i in 0 until count) {
        list.add(generaModel(startIndex + i))
    }

    return list
}

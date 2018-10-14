package com.ch1.no2.Kotlin

/**
 * Created by BossNam on 2018. 9. 26..
 */
data class NodeKt(var dataStr: String? = null,
                  var nextNodeKt: NodeKt? = null,
                  var prevNodeKt: NodeKt? = null)
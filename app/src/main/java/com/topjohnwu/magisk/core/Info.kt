package com.topjohnwu.magisk.core

import com.topjohnwu.magisk.DynAPK

val isRunningAsStub get() = Info.stub != null

object Info {

    var stub: DynAPK.Data? = null

}

/*
 * Copyright 2020 Mamoe Technologies and contributors.
 *
 * 此源代码的使用受 GNU AFFERO GENERAL PUBLIC LICENSE version 3 许可证的约束, 可以在以下链接找到该许可证.
 * Use of this source code is governed by the GNU AGPLv3 license that can be found through the following link.
 *
 * https://github.com/mamoe/mirai/blob/master/LICENSE
 */

package net.mamoe.mirai.api.http.context.serializer

import net.mamoe.mirai.api.http.adapter.internal.serializer.BuiltinJsonSerializer
import net.mamoe.mirai.api.http.adapter.internal.serializer.InternalSerializer

internal object InternalSerializerHolder {

    internal val serializer: InternalSerializer by lazy {
        BuiltinJsonSerializer()
    }
}
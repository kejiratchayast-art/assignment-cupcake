/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.cupcake.data

import com.example.cupcake.R

object DataSource {
    val flavors = listOf(
        R.string.vanilla,
        R.string.chocolate,
        R.string.strawberry,
        R.string.red_velvet,
        R.string.matcha,
        R.string.blueberry,
        R.string.cookies_cream,
        R.string.salted_caramel,
        R.string.lemon,
        R.string.coffee,
        R.string.coconut,
        R.string.rainbow
    )

    val quantityOptions = listOf(
        Pair(R.string.one_cupcake, 1),
        Pair(R.string.two_cupcakes, 2),
        Pair(R.string.four_cupcakes, 4),
        Pair(R.string.six_cupcakes, 6),
        Pair(R.string.twelve_cupcakes, 12),
        Pair(R.string.twenty_four_cupcakes, 24)
    )
}

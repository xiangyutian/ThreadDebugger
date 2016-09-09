/*
 * Copyright (C) 2015-2016 Jacksgong(blog.dreamtobe.cn)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.dreamtobe.threaddebugger;

/**
 * A no-op of the thread debugger.
 */

public interface IThreadDebugger {

    IThreadDebugger add(String key);

    IThreadDebugger add(String startWithKey, String alias);

    void refresh();

    String drawUpEachThreadSize();

    String drawUpEachThreadInfo();

    String drawUpEachThreadSizeDiff();

    String drawUpEachThreadInfoDiff();

    String drawUpUnknownInfo();

    boolean isSizeChanged();

    boolean isChanged();
}
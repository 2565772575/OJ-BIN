package com.binoj.binoj.judge.codesandbox;

import com.binoj.binoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.binoj.binoj.judge.codesandbox.model.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}

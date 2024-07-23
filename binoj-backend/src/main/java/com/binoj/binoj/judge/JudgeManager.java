package com.binoj.binoj.judge;

import com.binoj.binoj.judge.strategy.DefaultJudgeStrategy;
import com.binoj.binoj.judge.strategy.JavaLanguageJudgeStrategy;
import com.binoj.binoj.judge.strategy.JudgeContext;
import com.binoj.binoj.judge.strategy.JudgeStrategy;
import com.binoj.binoj.judge.codesandbox.model.JudgeInfo;
import com.binoj.binoj.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理（简化调用）
 */
@Service
public class JudgeManager {

    /**
     * 执行判题
     *
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }

}

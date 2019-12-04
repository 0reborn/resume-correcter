package com.reborn.resume.correcter;

import com.reborn.resume.correcter.bean.context.FileContentReaderContext;
import com.reborn.resume.correcter.bean.context.WordAnalyzerContext;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ResumeCorrecterApplication.class)
class ResumeCorrecterApplicationTests {

    @Autowired
    private FileContentReaderContext fileContentReaderContext;

    @Autowired
    private WordAnalyzerContext wordAnalyzerContext;

    private static final String RESUME_TEXT_DEMO = "工作经验至今有 1 年工作经验\n" +
            "?厦门市吉比特网络技术有限公司 2008年7月-2009年9月\n" +
            "公司性质：私营企业 行业类别：计算机业（软件、数据库、系统集成）\n" +
            "担任职位：计算机业(IT)类-测试工程师\n" +
            "工作描述：1、对软件质量进行功能测试，保证软件符合客户需求\n" +
            "2、编写维护软件测试代码，提高软件自动化测试功能\n" +
            "3、查找在软件测试过程中C#遇到的代码问题并分析解决\n" +
            "4、负责将不同时期的软件版本进行代码合并\n" +
            "5、辅导部门新员工，提高软件测试效率和质量 \n" +
            "\n" +
            "技能/专长\n" +
            "语言能力： 英语(良好)\n" +
            "计 算 机 能 力： 程序员\n" +
            "技能专长：\n" +
            "1、熟悉C/C++，JAVA，SQL语言\n" +
            "2、熟悉软件工程的测试方法，基本运用loadrunner工具\n" +
            "3、灵活运用软件控制系统，如CC和SVN\n" +
            "4、自学MFC，了解MFC的工作原理\n" +
            "5、在校Spring Boot期间，制作C-编译器的词法和语法分析器\n" +
            "6、具备一定的编程能力，曾编写过棋类游戏软件（单机和网络版的斗兽棋）\n" +
            "7、熟悉unix的基本操作，熟悉多线程工作原理，以及线程互斥的功能";

    @Test
    void test() {
    }
}
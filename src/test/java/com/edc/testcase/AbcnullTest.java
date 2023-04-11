package com.edc.testcase;

import com.edc.basetest.BaseTest;
import com.edc.pageobject.page.AbcnullPage;
import org.testng.annotations.Test;

/**
 * abcnull 页面测试用例
 *
 * @author abcnull
 * @version 1.0.0
 * @date 2020/1/28
 */
public class AbcnullTest extends BaseTest {
    private AbcnullPage abcnullPage;

    @Test(description = "abcnull页面_搜索测试", priority = 1)
    public void testSearch() {
        // 初始化 abcnull 页面
        abcnullPage = new AbcnullPage(driver, redisUtil);
        // 进入 abcnull 首页
        abcnullPage.enterPage();
        // abncull 页面搜索检测
        assert abcnullPage.search();
    }
}

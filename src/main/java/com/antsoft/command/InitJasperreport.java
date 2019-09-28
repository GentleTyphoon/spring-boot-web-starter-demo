package com.antsoft.command;

import net.sf.jasperreports.engine.JasperCompileManager;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * 启动时编译模板文件至jrxml->jasper
 */
@Component
public class InitJasperreport implements CommandLineRunner {
    @Override
    public void run(String... strings) throws Exception {
        JasperCompileManager.compileReportToFile(InitJasperreport.class.getClassLoader().getResource("").getPath() + "jasper/test_demo.jrxml",
                "test_demo.jasper");

        JasperCompileManager.compileReportToFile(InitJasperreport.class.getClassLoader().getResource("").getPath() + "jasper/TableReport.jrxml",
                "TableReport.jasper");

        JasperCompileManager.compileReportToFile(InitJasperreport.class.getClassLoader().getResource("").getPath() + "jasper/barChartDemo.jrxml",
                "barChartDemo.jasper");

        JasperCompileManager.compileReportToFile(InitJasperreport.class.getClassLoader().getResource("").getPath() + "jasper/pieChart.jrxml",
                "pieChart.jasper");

        JasperCompileManager.compileReportToFile(InitJasperreport.class.getClassLoader().getResource("").getPath() + "jasper/lineChart.jrxml",
                "lineChart.jasper");
        JasperCompileManager.compileReportToFile(InitJasperreport.class.getClassLoader().getResource("").getPath() + "jasper/tableChart.jrxml",
                "tableChart.jasper");
    }
}

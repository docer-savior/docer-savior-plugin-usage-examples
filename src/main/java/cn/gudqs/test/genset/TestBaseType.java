package cn.gudqs.test.genset;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;
import java.sql.*;
import java.util.Date;

/**
 * 八大基本类型(带包装)
 * @author wenquan
 * @date 2022/5/9
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TestBaseType {

    // 八大基本类型 byte short int long float double char boolean

    private byte testByte;

    private short testShort;

    private int testInt;

    private long testLong;

    private float testFloat;

    private double testDouble;

    private char testChar;

    private boolean testBoolean;

    private Byte testByteWithBoxWithBox;

    private Short testShortWithBoxWithBox;

    private Integer testIntWithBoxWithBox;

    private Long testLongWithBoxWithBox;

    private Float testFloatWithBoxWithBox;

    private Double testDoubleWithBoxWithBox;

    private Character testCharWithBoxWithBox;

    private Boolean testBooleanWithBoxWithBox;

    /**
     * test string
     */
    private String testString;

    /**
     * test date
     */
    private Date testDate;

    /**
     * test decimal
     */
    private BigDecimal testDecimal;

    /**
     * test number
     */
    private Number testNumber;

    /**
     * test sql time
     */
    private Time testTime;

    /**
     * test sql timestamp
     */
    private Timestamp testTimestamp;

    /**
     * test sql date
     */
    private java.sql.Date testSqlDate;

    /**
     * test blob
     */
    private Blob blob;

    /**
     * test clob
     */
    private Clob clob;

    /**
     * test nclob
     */
    private NClob nClob;

    /**
     * test multipart file
     */
    private MultipartFile file;

}

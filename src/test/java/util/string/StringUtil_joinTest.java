package util.string;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import com.eminpolat.util.string.StringUtil;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class StringUtil_joinTest {
    private final StringArrayStringBooleanResultInfo m_stringStringResultInfo;

    @Parameterized.Parameters
    public static Collection<StringArrayStringBooleanResultInfo> provideData()
    {
        return Arrays.asList(new StringArrayStringBooleanResultInfo(new String[]{"emin", "polat", "miraç"}, "::", true, "emin::polat::miraç"),
                new StringArrayStringBooleanResultInfo(new String[]{"emin", "polat", "miraç"}, "", true, "eminpolatmiraç"),
                new StringArrayStringBooleanResultInfo(new String[]{"emin", "polat", "miraç"}, "-", true, "emin-polat-miraç")


               );
    }

    public StringUtil_joinTest(StringArrayStringBooleanResultInfo stringStringResultInfo)
    {
        m_stringStringResultInfo = stringStringResultInfo;
    }

    @Test
    public void givenString_thenReturnStringChangedCases()
    {
        assertEquals(m_stringStringResultInfo.expected, StringUtil.join(m_stringStringResultInfo.texts, m_stringStringResultInfo.delim, m_stringStringResultInfo.removeEmpties));
    }
}

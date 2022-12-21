package Class12;

import static utils.BaseClass.*;

public class _03_Authentication_Alert {
    public static void main(String[] args) {

        /**
         * username = foo
         * password = bar
         */

        setUp("https://foo:bar@httpbin.org/basic-auth/foo/bar");



        tearDown();
    }
}

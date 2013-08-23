mvn clean install -DskipTests
rm -rf $tom/sms-booking*
cp target/sms-booking.war $tom

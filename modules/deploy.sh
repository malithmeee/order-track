mvn clean install -DskipTests
rm -rf $tom/sms-booking*
cp web/target/sms-booking.war $tom

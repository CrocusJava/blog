run spring boot
gradle clean build && java -jar build/libs/gs-actuator-service-0.1.0.jar



run compiller TS
tsc --watch -m commonjs -t es5 --emitDecoratorMetadata --experimentalDecorators app.ts
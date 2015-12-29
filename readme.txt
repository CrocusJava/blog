run spring boot
gradle clean build && java -jar build/libs/blog-0.1.0.jar
or
gradle8 clean build && java -jar build/libs/blog-0.1.0.jar



run compiller TS
tsc --watch -m commonjs -t es5 --emitDecoratorMetadata --experimentalDecorators app.ts
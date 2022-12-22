package nl.vintik.workshop.aws.lambda

import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.RequestHandler
import org.slf4j.LoggerFactory

@Suppress("UNUSED")
class KotlinLambda : RequestHandler<EventBridgeMessage<Reindeer>, String> {
    private val logger = LoggerFactory.getLogger(this::class.java)

    override fun handleRequest(event: EventBridgeMessage<Reindeer>, context: Context): String {
        logger.info("Handle request for event $event")
        return "Merry Christmas!"
    }
}
package nl.vintik.workshop.aws.lambda

data class EventBridgeMessage <T>(
        var detail: T? = null,
        var region: String = "",
        var source: String = "",
        var time: String = ""
)
data class Reindeer(
        var id: String = "",
        var name: String = "",
        var speed: Int = 0,
        var skill: String? = null,
        var description: String? = null
)
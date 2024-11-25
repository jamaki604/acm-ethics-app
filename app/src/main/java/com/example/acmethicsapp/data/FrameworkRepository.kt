package com.example.acmethicsapp.data

import com.example.acmethicsapp.model.Framework

object FrameworkRepository {
    val frameworks = listOf(
        Framework(
            id = "framework1",
            title = "Framework 1 Title",
            description = """
            Framework 1 provides detailed guidelines on ethical considerations for computing professionals.
            Key Points:
            - Promote public trust.
            - Protect privacy and confidentiality.
            - Avoid deceptive practices and conflicts of interest.
        """.trimIndent()
        ),
        Framework(
            id = "framework2",
            title = "Framework 2 Title",
            description = """
            Framework 2 emphasizes the importance of ensuring fairness, accountability, and transparency in computing systems.
            Key Points:
            - Ensure accessibility for all.
            - Be accountable for systems' outcomes.
            - Enhance transparency in decision-making processes.
        """.trimIndent()
        ),
        Framework(
            id = "framework3",
            title = "Framework 3 Title",
            description = """
            Framework 3 focuses on fostering innovation while adhering to ethical guidelines in the development of new technologies.
            Key Points:
            - Promote innovation that benefits society.
            - Address ethical implications of emerging technologies.
            - Balance progress with responsibility.
        """.trimIndent()
        ),
        Framework(
            id = "framework4",
            title = "Framework 4 Title",
            description = """
            Framework 4 highlights the importance of sustainability and environmental impact in computing practices.
            Key Points:
            - Minimize environmental footprint of technologies.
            - Develop sustainable computing solutions.
            - Encourage practices that reduce e-waste and conserve resources.
        """.trimIndent()
        ),
        Framework(
            id = "framework5",
            title = "Framework 5 Title",
            description = """
            Framework 5 underscores the significance of collaboration and inclusivity in the computing industry.
            Key Points:
            - Foster collaboration across disciplines and teams.
            - Promote diversity and inclusion in technology development.
            - Ensure equitable access to computing resources.
        """.trimIndent()
        )
    )

}

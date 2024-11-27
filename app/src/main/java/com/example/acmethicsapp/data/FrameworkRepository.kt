package com.example.acmethicsapp.data

import com.example.acmethicsapp.model.Framework

object FrameworkRepository {
    val frameworks = listOf(
        Framework(
            id = "framework1",
            title = "The Utilitarian Approach",
            description = """
            The Utilitarian Approach focuses on actions that provide the greatest good or the least harm for all affected parties. 
            It aims to maximize positive outcomes and minimize negative consequences.

            Key Points:
            - Ethical actions aim to produce the greatest good and minimize harm.
            - Balances benefits and consequences for all stakeholders, including customers, employees, and the environment.
            - Focuses on increasing good outcomes while reducing harmful impacts.
            """.trimIndent()
        ),
        Framework(
            id = "framework2",
            title = "The Rights Approach",
            description = """
            The Rights Approach emphasizes protecting and respecting the moral rights of all individuals. 
            It is based on the inherent dignity of individuals and their ability to choose freely.

            Key Points:
            - Prioritizes the moral rights of individuals, including truth, privacy, and personal freedom.
            - Encourages treating people as ends, not means to other ends.
            - Stresses duties to respect the rights of others.
            """.trimIndent()
        ),
        Framework(
            id = "framework3",
            title = "The Fairness or Justice Approach",
            description = """
            The Fairness or Justice Approach is rooted in the principle of treating all individuals equally and fairly. 
            Ethical actions should be based on defensible standards of fairness.

            Key Points:
            - Promotes equal treatment for all individuals or justifiable unequal treatment based on defensible standards.
            - Encourages fairness in compensation and opportunities.
            - Questions practices like significant disparities in salaries or imbalances of power.
            """.trimIndent()
        ),
        Framework(
            id = "framework4",
            title = "The Common Good Approach",
            description = """
            The Common Good Approach highlights the importance of actions that contribute to the welfare of the community. 
            It values respect, compassion, and interdependence within society.

            Key Points:
            - Encourages respect and compassion for all, particularly the vulnerable.
            - Stresses the importance of shared systems like public health, education, and safety.
            - Advocates for actions that enhance community welfare and interconnectedness.
            """.trimIndent()
        ),
        Framework(
            id = "framework5",
            title = "The Virtue Approach",
            description = """
            The Virtue Approach focuses on actions that align with ideal virtues, enabling individuals to act at their highest potential. 
            Virtue ethics emphasize character and values like truth, courage, and integrity.

            Key Points:
            - Encourages actions that align with virtues like honesty, courage, and fairness.
            - Focuses on personal growth and humanity's full potential.
            - Asks how actions reflect on one's character and best self.
            """.trimIndent()
        )
    )
}

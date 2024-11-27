package com.example.acmethicsapp.data

import com.example.acmethicsapp.model.Section

object Chapter3Repository {
    val sections = listOf(
        Section(
            id = "chapter3.1",
            title = "3.1 Ensure that the public good is the central concern during all professional computing work",
            description = """
                Leaders must prioritize the public good in all stages of professional computing work, including research, design, implementation, testing, and maintenance. This principle ensures that people—including users, customers, and colleagues—are always central to computing decisions, regardless of methodology or techniques used.
            """.trimIndent()
        ),
        Section(
            id = "chapter3.2",
            title = "3.2 Articulate, encourage acceptance of, and evaluate fulfillment of social responsibilities by members of the organization or group",
            description = """
                Leaders must promote organizational responsibility toward societal welfare by:
                - Encouraging full participation in meeting social responsibilities.
                - Reducing harm to the public.
                - Raising awareness of technology's societal influence through quality and transparency-oriented procedures.
            """.trimIndent()
        ),
        Section(
            id = "chapter3.3",
            title = "3.3 Manage personnel and resources to enhance the quality of working life",
            description = """
                Leaders should:
                - Enhance personal and professional development.
                - Ensure accessibility, physical safety, psychological well-being, and dignity in the workplace.
                - Use ergonomic standards to create a positive working environment.
            """.trimIndent()
        ),
        Section(
            id = "chapter3.4",
            title = "3.4 Articulate, apply, and support policies and processes that reflect the principles of the Code",
            description = """
                Leaders should:
                - Establish clear, ethical organizational policies aligned with the Code.
                - Communicate these policies effectively to stakeholders.
                - Reward compliance and address violations appropriately.
                Designing processes that violate the Code is ethically unacceptable.
            """.trimIndent()
        ),
        Section(
            id = "chapter3.5",
            title = "3.5 Create opportunities for members of the organization or group to grow as professionals",
            description = """
                Leaders should:
                - Provide educational opportunities for professional growth in technical and ethical areas.
                - Familiarize team members with system consequences and limitations.
                - Ensure professionals understand complexity and their responsibility in addressing it effectively.
            """.trimIndent()
        ),
        Section(
            id = "chapter3.6",
            title = "3.6 Use care when modifying or retiring systems",
            description = """
                Leaders should:
                - Consider user productivity and quality of work when modifying or discontinuing system features.
                - Investigate alternatives to retiring legacy systems or assist in graceful migration to alternatives.
                - Notify users of risks from unsupported systems and help monitor operational viability.
            """.trimIndent()
        ),
        Section(
            id = "chapter3.7",
            title = "3.7 Recognize and take special care of systems that become integrated into the infrastructure of society",
            description = """
                Leaders have added responsibilities for systems integrated into societal infrastructure by:
                - Establishing fair access policies.
                - Monitoring system adoption and adjusting ethical responsibilities accordingly.
                - Developing standards of care when none exist.
                Systems affecting areas like commerce, healthcare, or education require continuous ethical oversight and stewardship.
            """.trimIndent()
        )
    )
}

import {Stack, StackProps} from 'aws-cdk-lib';
import {Construct} from 'constructs';
import * as secretsmanager from 'aws-cdk-lib/aws-secretsmanager';

export class CdkStack extends Stack {
    constructor(scope: Construct, id: string, props?: StackProps) {
        super(scope, id, props);

        // Default secret
        const secret = new secretsmanager.Secret(this, 'db-secret', {
            secretName: "db-secret",
            description: "db credentials Secret",
            generateSecretString: {
                secretStringTemplate: JSON.stringify({
                    "engine": "h2",
                    "username": "sa",
                    "host": "mem",
                    "dbname": "test"
                }),
                generateStringKey: 'password',
            }
        });
    }
}
